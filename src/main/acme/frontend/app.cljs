(ns acme.frontend.app
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red "] "text."]])

(defn render-simple []
  (rd/render
   [simple-component]
   (js/document.getElementById "app")))

(defn init []
  (render-simple)
  #_(println "Hello World")
  )