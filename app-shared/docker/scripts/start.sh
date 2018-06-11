#!/bin/bash

/usr/sbin/startup.sh && /usr/sbin/sshd -D&

echo "Waiting for Oracle listener..."

while [ `nmap -p 1521 localhost|egrep -c "1521/tcp\s+open"` -lt 1 ]
do
	echo "Waiting..."
	sleep 5s
done

echo "Database Ready for use."

while [ 'pgrep java' ]
do
   sleep 5s
done

echo "Container stopped..."