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
calendar.month.as-number --month September
runtime.cpus
math.random.from-0-to-1
math.random.integer --max 10000
math.random.integer-except-0 --min 100 --max 10000
crypto.md5
crypto.sha.1
crypto.sha.256
crypto.sha.512
crypto.base.64.encode.for-string
crypto.base.64.encode.for-url
crypto.base.64.decode.for-string
crypto.base.64.decode.for-url
csv.read-file.as-string --file "/Users/dimiefthymiou/Downloads/1.csv" --cache "cache1" --cache-key "csv1"
exit
EOF
#compress.zip.input-files --out-dir|-o "/Users/dimiefthymiou/Downloads" --zip-name|-n "zipfile.zip" --files|-f /Users/dimiefthymiou/Downloads/1.xml,/Users/dimiefthymiou/Downloads/2.xml
#compress.zip.input-dirs --out-dir|-o "/Users/dimiefthymiou/Downloads" --zip-name|-n "zipfile.zip" --dirs|-d /Users/dimiefthymiou/Downloads/dir1,/Users/dimiefthymiou/Downloads/dir2
