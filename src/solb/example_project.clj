(ns solb.example-project
    (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler 
    [request]
    {:status 200 
     :headers {"Content-Type" "text/html"}
     :body "this is the example."})

(defn -main [& args] 
    (run-jetty handler {:port 5000}))
