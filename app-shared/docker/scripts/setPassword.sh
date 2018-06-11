#!/bin/bash

ORACLE_PWD=$1

cd /u01/app/oracle/product/11.2.0/xe/apex

su -p oracle -c "${ORACLE_HOME}/bin/sqlplus / as sysdba << EOF
	ALTER USER SYS IDENTIFIED BY "$ORACLE_PWD";
	ALTER USER SYSTEM IDENTIFIED BY "$ORACLE_PWD";
	define PASSWD = "$ORACLE_PWD"
	@apxchpwd
	exit;
EOF"

