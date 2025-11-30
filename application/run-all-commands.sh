#!/usr/bin/env bash
set -euo pipefail
JAR="target/app.jar"
java -jar "$JAR" <<'EOF'
commands
log.info --message "log message"
log.error --message "log error message"
exit
EOF
