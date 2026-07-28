# capability-mmio-map

Atomic authority package for `mmio/map`.

- imports: `#{:mmio-map}`
- effects: `#{:memory-access :device-control}`
- default policy: `:autonomous`
- semantic definition CID: `bafyreigeh26tuyndf55r2d3garz4m3dndcgumlalu6x2mnhvhtuctu3l5i`
- hash contract CID: `bafkreiflhj3fslsbh7okdas2fzlhmogai64x6p3lkla6gtr7berbp7ftvi`
- provider status: `contract-only`

The repository name is a discovery alias. The semantic definition CID
is the immutable import identity. Importing it does not grant runtime
authority: Tamaki must request it explicitly and Kototama must admit
the sealed envelope.

```sh
clojure -M:test
```
