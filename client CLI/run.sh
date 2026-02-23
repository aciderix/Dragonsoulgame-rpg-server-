#!/bin/bash
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

if [ -f dragonsoul-headless.jar ]; then
    java -jar dragonsoul-headless.jar "$@"
else
    java -cp dragonsoul-cli.jar:game-bytecode.jar:runtime-stubs.jar cli.Main "$@"
fi
