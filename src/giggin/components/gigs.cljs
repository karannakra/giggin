(ns giggin.components.gigs
  (:require [giggin.state :as state]
            [giggin.components.helpers :refer [format-price]]))


(defn gigs
  []
  [:main
   [:div.gigs
    (for [{:keys [id img title price description]} (vals @state/gigs)]
      [:div.gig {:key id}
       [:img.gig__artwork {:src img :alt title}]
       [:div.gig__body
        [:div.gig__title
         [:div.btn.btn--primary.float--right.tooltip {:data-tooltip "Add to order" :on-click (fn [] (swap! state/orders update id inc))}
          [:i.icon.icon--plus]] title]
        [:p.gig__price (format-price price)]
        [:p.gig__desc description]]])]])



;;  (map (fn [gig]) (vals @state/gigs)) for map markup

