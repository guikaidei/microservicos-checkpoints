# microservicos-checkpoints

kubectl apply -f api/db/k8s/k8s.yaml
kubectl apply -f api/bottlenecks/grafana/k8s/k8s.yaml
kubectl apply -f api/bottlenecks/prometheus/k8s/k8s.yaml
kubectl apply -f api/bottlenecks/redis/k8s/k8s.yaml
kubectl apply -f api/account-service/k8s/k8s.yaml
kubectl apply -f api/auth-service/k8s/k8s.yaml
kubectl apply -f api/gateway-service/k8s/k8s.yaml
kubectl apply -f api/order-service/k8s/k8s.yaml
kubectl apply -f api/product-service/k8s/k8s.yaml