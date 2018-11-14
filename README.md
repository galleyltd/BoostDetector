# BoostDetector
[![Build Status](https://travis-ci.com/galleyltd/boost-detector-backend.svg?branch=master)](https://travis-ci.com/galleyltd/boost-detector-backend)
[![codecov](https://codecov.io/gh/galleyltd/boost-detector-backend/branch/master/graph/badge.svg)](https://codecov.io/gh/galleyltd/boost-detector-backend)

### Startup with Redis in Docker container
```bash
docker-compose run -d --service-ports redis
```

Run App.kt from your favourite IDE

### Complete startup
```bash
./gradlew clean build
docker-compose up -d --build
```

If you want to shut down app later, run:
```bash
docker-compose down
```
