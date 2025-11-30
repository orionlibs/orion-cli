#!/usr/bin/env bash
set -euo pipefail
JAR="target/app.jar"
java -jar "$JAR" <<'EOF'
help1
help2 --name Dimi
exit
EOF
