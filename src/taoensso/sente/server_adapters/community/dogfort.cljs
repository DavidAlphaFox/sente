(ns taoensso.sente.server-adapters.community.dogfort
  "Sente server adapter for Node.js with Dog Fort,
  Ref. <https://github.com/whamtet/dogfort>."
  {:author "Matthew Molloy <@whamtet>"}
  (:require
   [taoensso.encore :as enc :refer-macros ()]
   [taoensso.sente.server-adapters.community.generic-node :as generic-node]))

(defn get-sch-adapter
  "Dogfort doesn't need anything special, can just use the `generic-node-ws`
  adapter."
  [] (generic-node/get-sch-adapter))

(enc/deprecated
  ;; These are stateful, could be problematic?
  (def dogfort-adapter          "Deprecated" (get-sch-adapter))
  (def sente-web-server-adapter "Deprecated"  dogfort-adapter))
