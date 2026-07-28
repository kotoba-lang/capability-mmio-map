(ns kotoba.capability.mmio.map-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.mmio.map :as capability]
            [kotoba.core.capability-repository :as repository]
            [kotoba.core.contracts :as contracts]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest
             (contracts/capability-contract)
             capability/manifest))))
