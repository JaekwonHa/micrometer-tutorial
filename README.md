# springboot + micrometer + prometheus + grafana
> * https://pyxispub.uzuki.live/?p=1810#Prometheus%EC%97%90_%EC%B6%94%EA%B0%80%ED%95%98%EA%B8%B0
> * https://jongmin92.github.io/2019/12/04/Spring/prometheus/

```bash
docker run -p 9090:9090 -v /Users/user/workspace/personal/micrometer-demo/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml --name prometheus -d prom/prometheus --config.file=/etc/prometheus/prometheus.yml

docker run -d --name=grafana -p 3000:3000 grafana/grafana
# admin/admin

watch -n5 'curl http://localhost:8080/hello'
```
