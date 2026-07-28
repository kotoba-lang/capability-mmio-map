(ns kotoba.capability.mmio.map
  "Importable contract for mmio/map.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:mmio-map}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z3Pfx2pcf59cizdozsEEY1m6a2si3", :capability/repository "kotoba-lang/capability-mmio-map", :capability/id "mmio/map", :capability/effects #{:memory-access :device-control}, :capability/provider-status :contract-only})
