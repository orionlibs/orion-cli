#!/usr/bin/env bash
set -euo pipefail
JAR="target/app.jar"
java -jar "$JAR" <<'EOF'
commands
log.info --message "log message"
log.error --message "log error message"
cache.create --name "cache1"
cache.element.add --name "cache1" --key "key1" --value "value1"
cache.element.get --name "cache1" --key "key1"
cache.element.add --name "cache1" --key "key1" --value "value2"
cache.element.get --name "cache1" --key "key1"
cache.size --name "cache1"
cache.empty --name "cache1"
cache.size --name "cache1"
cache.element.add --name "cache1" --key "key1" --value "value1"
cache.size --name "cache1"
cache.element.delete --name "cache1" --key "key1"
cache.size --name "cache1"
cache.registry-size
cache.delete --name "cache1"
cache.delete-all
exit
EOF
