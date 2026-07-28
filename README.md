# capability-mmio-map

Atomic authority package for `mmio/map`.

- imports: `#{:mmio-map}`
- effects: `#{:memory-access :device-control}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
