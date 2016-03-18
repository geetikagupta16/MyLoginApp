
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/gitrepository/AjaxWithPlay/bootstrapform/conf/routes
// @DATE:Thu Mar 17 18:09:03 IST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseDashboardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def addAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.addAssignment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addAssignment"})
        }
      """
    )
  
    // @LINE:40
    def getAllLanguages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAllLanguages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllLanguages"})
        }
      """
    )
  
    // @LINE:58
    def updateAward: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.updateAward",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateAward"})
        }
      """
    )
  
    // @LINE:52
    def deleteLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.deleteLanguage",
      """
        function(sno) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteLanguage" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("sno", sno)])})
        }
      """
    )
  
    // @LINE:20
    def addProgLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.addProgLanguage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addProgLanguage"})
        }
      """
    )
  
    // @LINE:54
    def deleteProgLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.deleteProgLanguage",
      """
        function(sno) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteProgLanguage" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("sno", sno)])})
        }
      """
    )
  
    // @LINE:44
    def getAllAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAllAssignments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllAssignments"})
        }
      """
    )
  
    // @LINE:22
    def getAdminDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAdminDashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminDashboard"})
        }
      """
    )
  
    // @LINE:56
    def editAward: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.editAward",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editAward" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:34
    def getAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAssignments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getassignments"})
        }
      """
    )
  
    // @LINE:36
    def getProgLanguages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getProgLanguages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getproglanguages"})
        }
      """
    )
  
    // @LINE:66
    def updateProgLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.updateProgLanguage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProgLanguage"})
        }
      """
    )
  
    // @LINE:60
    def editLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.editLanguage",
      """
        function(sno) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editLanguage" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("sno", sno)])})
        }
      """
    )
  
    // @LINE:38
    def getAllAwards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAllAwards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllAwards"})
        }
      """
    )
  
    // @LINE:62
    def updateLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.updateLanguage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateLanguage"})
        }
      """
    )
  
    // @LINE:46
    def getAllInterns: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAllInterns",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllInterns"})
        }
      """
    )
  
    // @LINE:64
    def editProgLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.editProgLanguage",
      """
        function(sno) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProgLanguage" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("sno", sno)])})
        }
      """
    )
  
    // @LINE:14
    def getDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getDashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:42
    def getAllProgLanguages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAllProgLanguages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllProgLanguages"})
        }
      """
    )
  
    // @LINE:28
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:30
    def getAwards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getAwards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getawards"})
        }
      """
    )
  
    // @LINE:16
    def addAward: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.addAward",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addAward"})
        }
      """
    )
  
    // @LINE:18
    def addLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.addLanguage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addLanguage"})
        }
      """
    )
  
    // @LINE:50
    def deleteAward: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.deleteAward",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteAward" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:32
    def getLanguages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.getLanguages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getlanguages"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def auth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.auth",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:24
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}