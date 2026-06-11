server:
  port: 8080

spring:
  data:
    mongodb:
      uri: mongodb://localhost:27017/payment

resilience4j:
  circuitbreaker:
    configs:
      default:
        registerHealthIndicator: true
        slidingWindowSize: 10
        failureRateThreshold: 50
        waitDurationInOpenState: 10000
        permittedNumberOfCallsInHalfOpenState: 3
  retry:    configs:
      default:
        maxAttempts: 3
        waitDuration: 1000
  bulkhead:
    configs:
      default:
        maxConcurrentCalls: 10
        waitDurationInQueue: 1000