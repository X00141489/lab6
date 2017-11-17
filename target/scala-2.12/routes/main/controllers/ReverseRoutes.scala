
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/conf/routes
// @DATE:Fri Nov 10 16:18:11 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:11
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:13
    def index(name:String = "visitor"): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(name == "visitor") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
