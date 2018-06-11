# Docker Setup - New Core Oracle Database
### Building the Image
```
cd core
docker build --rm -t core-oracle-11 -f docker/core-oracle/Dockerfile .
```

### Running a container
```
docker run --name core-oracle -d -p 41521:1521 -p 41522:22 -p 48080:8080 core-oracle-11
```
