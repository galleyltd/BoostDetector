# BoostDetector
[![Build Status](https://travis-ci.com/galleyltd/BoostDetector.svg?branch=master)](https://travis-ci.com/galleyltd/BoostDetector)

### Redis startup
```bash
docker-compose run -d --service-ports redis
```

### Complete startup
```bash
./gradlew build
docker-compose up -d --build
```
