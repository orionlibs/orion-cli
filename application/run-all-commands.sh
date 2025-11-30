#!/usr/bin/env bash
set -euo pipefail
JAR="target/app.jar"
java -jar "$JAR" <<'EOF'
commands
log.info --message "log message"
exit
EOF
