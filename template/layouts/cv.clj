; @title  default title
; @format html5

[:head
 [:meta {:charset (:charset site)}]
 [:meta {:name    "viewport"
         :content "width=device-width, initiali-scale=1.0, user-scalable=yes"}]

 [:title
  (if (= (:title site) "home")
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:link {:rel   "shortcut icon"
         :href  "/favicon.ico"}]
 [:link {:href  "/atom.xml"
         :rel   "alternate"
         :title (:title site)
         :type  "application/atom+xml"}]

 (css ["http://fonts.googleapis.com/css?family=Kotta+One" (:css site ()) "/css/cv.css"])
 (css {:media "only screen and (max-device-width:480px)"} (:device-css site))]
; /head

[:body

 [:div {:id "ant"}]

 (container
   [:nav
    [:ul
     [:li [:a {:href "/"} "Home"]]
     [:li [:a {:href "/about.html"} "About"]]
     [:li [:a {:href "/cv.html"} "CV"]]
     [:li [:a {:href "/contact.html"} "Contact"]]]]

    contents
 
   [:footer
    [:small "&copy; 2013 Nebojša Stričević"]])
 ; /container

 (js ["/js/prettify.js"
      "/js/lang-clj.js"
      (:js site ())])]
; /body
