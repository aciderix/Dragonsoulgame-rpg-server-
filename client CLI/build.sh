#!/bin/bash
# DragonSoul Headless CLI - Build Script
set -e

echo "=== Building DragonSoul Headless CLI ==="

# Check Java
if ! command -v javac &> /dev/null; then
    echo "ERROR: javac not found. Install JDK 11+."
    exit 1
fi

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

# 1) Compile runtime stubs
echo "[1/3] Compiling runtime stubs..."
mkdir -p build/stubs
javac -d build/stubs -source 11 -target 11 -nowarn \
    src/stubs/org/apache/commons/logging/*.java \
    src/stubs/android/content/res/*.java \
    src/stubs/android/os/*.java \
    src/stubs/android/util/*.java \
    src/stubs/android/content/Context.java \
    src/stubs/android/content/SharedPreferences.java \
    2>&1
cd build/stubs && jar cf ../../runtime-stubs.jar . && cd "$SCRIPT_DIR"

# 2) Compile CLI
echo "[2/3] Compiling CLI engine..."
mkdir -p build/cli
javac -d build/cli -source 11 -target 11 \
    -cp game-bytecode.jar \
    src/cli/Main.java src/cli/GameEngine.java
cd build/cli && jar cf ../../dragonsoul-cli.jar cli/ && cd "$SCRIPT_DIR"

# 3) Create fat JAR
echo "[3/3] Creating fat JAR..."
mkdir -p build/fat
cd build/fat
jar xf ../../game-bytecode.jar
jar xf ../../runtime-stubs.jar
cp -r ../cli/* .
echo "Main-Class: cli.Main" > manifest.txt
jar cfm ../../dragonsoul-headless.jar manifest.txt .
cd "$SCRIPT_DIR"

echo ""
echo "=== BUILD COMPLETE ==="
echo ""
echo "Run with: java -jar dragonsoul-headless.jar [--seed N] [--autoboot] [--pipe]"
echo "Or:       java -cp dragonsoul-cli.jar:game-bytecode.jar:runtime-stubs.jar cli.Main"
