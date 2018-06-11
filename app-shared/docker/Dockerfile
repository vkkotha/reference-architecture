FROM dc1udtlhart02.stack.qadev.corp:5100/oracle:latest

ENV INSTALL_DIR "/install"
ENV ORACLE_SCRIPTS_DIR ${INSTALL_DIR}/scripts
ENV SQL_DIR ${ORACLE_SCRIPTS_DIR}/sql
ENV ORACLE_PWD oracle

RUN apt-get update && apt-get install -y dos2unix

COPY scripts ${ORACLE_SCRIPTS_DIR}

RUN chmod 755 ${ORACLE_SCRIPTS_DIR}/start.sh && \
	chmod 755 ${ORACLE_SCRIPTS_DIR}/setPassword.sh & \
	find ${ORACLE_SCRIPTS_DIR} -type f -print0 | xargs -0 dos2unix

RUN service oracle-xe start && \
	${ORACLE_SCRIPTS_DIR}/setPassword.sh ${ORACLE_PWD} && \
	${ORACLE_HOME}/bin/sqlplus -s system/${ORACLE_PWD} @${SQL_DIR}/init.sql
	
CMD ["/install/scripts/start.sh"]
