
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/gitrepository/AjaxWithPlay/bootstrapform/conf/routes
// @DATE:Thu Mar 17 18:09:03 IST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseWebJarAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:14
  class ReverseDashboardController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def addAssignment(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addAssignment")
    }
  
    // @LINE:40
    def getAllLanguages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAllLanguages")
    }
  
    // @LINE:58
    def updateAward(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateAward")
    }
  
    // @LINE:52
    def deleteLanguage(sno:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteLanguage" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("sno", sno)))))
    }
  
    // @LINE:20
    def addProgLanguage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addProgLanguage")
    }
  
    // @LINE:54
    def deleteProgLanguage(sno:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteProgLanguage" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("sno", sno)))))
    }
  
    // @LINE:44
    def getAllAssignments(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAllAssignments")
    }
  
    // @LINE:22
    def getAdminDashboard(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminDashboard")
    }
  
    // @LINE:56
    def editAward(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "editAward" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:34
    def getAssignments(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getassignments")
    }
  
    // @LINE:36
    def getProgLanguages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getproglanguages")
    }
  
    // @LINE:66
    def updateProgLanguage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateProgLanguage")
    }
  
    // @LINE:60
    def editLanguage(sno:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "editLanguage" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("sno", sno)))))
    }
  
    // @LINE:38
    def getAllAwards(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAllAwards")
    }
  
    // @LINE:62
    def updateLanguage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateLanguage")
    }
  
    // @LINE:46
    def getAllInterns(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAllInterns")
    }
  
    // @LINE:64
    def editProgLanguage(sno:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "editProgLanguage" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("sno", sno)))))
    }
  
    // @LINE:14
    def getDashboard(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:42
    def getAllProgLanguages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAllProgLanguages")
    }
  
    // @LINE:28
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:30
    def getAwards(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getawards")
    }
  
    // @LINE:16
    def addAward(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addAward")
    }
  
    // @LINE:18
    def addLanguage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addLanguage")
    }
  
    // @LINE:50
    def deleteAward(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteAward" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:32
    def getLanguages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getlanguages")
    }
  
  }

  // @LINE:24
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def auth(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:24
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}