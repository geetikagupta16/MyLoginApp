
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/gitrepository/AjaxWithPlay/bootstrapform/conf/routes
// @DATE:Thu Mar 17 18:09:03 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:11
  WebJarAssets_2: controllers.WebJarAssets,
  // @LINE:14
  DashboardController_0: controllers.DashboardController,
  // @LINE:24
  LoginController_3: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:11
    WebJarAssets_2: controllers.WebJarAssets,
    // @LINE:14
    DashboardController_0: controllers.DashboardController,
    // @LINE:24
    LoginController_3: controllers.LoginController
  ) = this(errorHandler, Application_4, Assets_1, WebJarAssets_2, DashboardController_0, LoginController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, Assets_1, WebJarAssets_2, DashboardController_0, LoginController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.DashboardController.getDashboard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAward""", """controllers.DashboardController.addAward"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLanguage""", """controllers.DashboardController.addLanguage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProgLanguage""", """controllers.DashboardController.addProgLanguage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminDashboard""", """controllers.DashboardController.getAdminDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.LoginController.auth"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.DashboardController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getawards""", """controllers.DashboardController.getAwards"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getlanguages""", """controllers.DashboardController.getLanguages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getassignments""", """controllers.DashboardController.getAssignments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getproglanguages""", """controllers.DashboardController.getProgLanguages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllAwards""", """controllers.DashboardController.getAllAwards"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllLanguages""", """controllers.DashboardController.getAllLanguages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllProgLanguages""", """controllers.DashboardController.getAllProgLanguages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllAssignments""", """controllers.DashboardController.getAllAssignments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllInterns""", """controllers.DashboardController.getAllInterns"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAssignment""", """controllers.DashboardController.addAssignment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteAward""", """controllers.DashboardController.deleteAward(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteLanguage""", """controllers.DashboardController.deleteLanguage(sno:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProgLanguage""", """controllers.DashboardController.deleteProgLanguage(sno:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editAward""", """controllers.DashboardController.editAward(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAward""", """controllers.DashboardController.updateAward"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editLanguage""", """controllers.DashboardController.editLanguage(sno:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateLanguage""", """controllers.DashboardController.updateLanguage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProgLanguage""", """controllers.DashboardController.editProgLanguage(sno:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProgLanguage""", """controllers.DashboardController.updateProgLanguage"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_WebJarAssets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at2_invoker = createInvoker(
    WebJarAssets_2.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DashboardController_getDashboard3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_DashboardController_getDashboard3_invoker = createInvoker(
    DashboardController_0.getDashboard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getDashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DashboardController_addAward4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAward")))
  )
  private[this] lazy val controllers_DashboardController_addAward4_invoker = createInvoker(
    DashboardController_0.addAward,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "addAward",
      Nil,
      "POST",
      """""",
      this.prefix + """addAward"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_DashboardController_addLanguage5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLanguage")))
  )
  private[this] lazy val controllers_DashboardController_addLanguage5_invoker = createInvoker(
    DashboardController_0.addLanguage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "addLanguage",
      Nil,
      "POST",
      """""",
      this.prefix + """addLanguage"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_DashboardController_addProgLanguage6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProgLanguage")))
  )
  private[this] lazy val controllers_DashboardController_addProgLanguage6_invoker = createInvoker(
    DashboardController_0.addProgLanguage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "addProgLanguage",
      Nil,
      "POST",
      """""",
      this.prefix + """addProgLanguage"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_DashboardController_getAdminDashboard7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminDashboard")))
  )
  private[this] lazy val controllers_DashboardController_getAdminDashboard7_invoker = createInvoker(
    DashboardController_0.getAdminDashboard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAdminDashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """adminDashboard"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LoginController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login8_invoker = createInvoker(
    LoginController_3.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LoginController_auth9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_LoginController_auth9_invoker = createInvoker(
    LoginController_3.auth,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "auth",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_DashboardController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_DashboardController_logout10_invoker = createInvoker(
    DashboardController_0.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_DashboardController_getAwards11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getawards")))
  )
  private[this] lazy val controllers_DashboardController_getAwards11_invoker = createInvoker(
    DashboardController_0.getAwards,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAwards",
      Nil,
      "GET",
      """""",
      this.prefix + """getawards"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_DashboardController_getLanguages12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getlanguages")))
  )
  private[this] lazy val controllers_DashboardController_getLanguages12_invoker = createInvoker(
    DashboardController_0.getLanguages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getLanguages",
      Nil,
      "GET",
      """""",
      this.prefix + """getlanguages"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_DashboardController_getAssignments13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getassignments")))
  )
  private[this] lazy val controllers_DashboardController_getAssignments13_invoker = createInvoker(
    DashboardController_0.getAssignments,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAssignments",
      Nil,
      "GET",
      """""",
      this.prefix + """getassignments"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_DashboardController_getProgLanguages14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getproglanguages")))
  )
  private[this] lazy val controllers_DashboardController_getProgLanguages14_invoker = createInvoker(
    DashboardController_0.getProgLanguages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getProgLanguages",
      Nil,
      "GET",
      """""",
      this.prefix + """getproglanguages"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_DashboardController_getAllAwards15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllAwards")))
  )
  private[this] lazy val controllers_DashboardController_getAllAwards15_invoker = createInvoker(
    DashboardController_0.getAllAwards,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAllAwards",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllAwards"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_DashboardController_getAllLanguages16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllLanguages")))
  )
  private[this] lazy val controllers_DashboardController_getAllLanguages16_invoker = createInvoker(
    DashboardController_0.getAllLanguages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAllLanguages",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllLanguages"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_DashboardController_getAllProgLanguages17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllProgLanguages")))
  )
  private[this] lazy val controllers_DashboardController_getAllProgLanguages17_invoker = createInvoker(
    DashboardController_0.getAllProgLanguages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAllProgLanguages",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllProgLanguages"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_DashboardController_getAllAssignments18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllAssignments")))
  )
  private[this] lazy val controllers_DashboardController_getAllAssignments18_invoker = createInvoker(
    DashboardController_0.getAllAssignments,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAllAssignments",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllAssignments"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_DashboardController_getAllInterns19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllInterns")))
  )
  private[this] lazy val controllers_DashboardController_getAllInterns19_invoker = createInvoker(
    DashboardController_0.getAllInterns,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "getAllInterns",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllInterns"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_DashboardController_addAssignment20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAssignment")))
  )
  private[this] lazy val controllers_DashboardController_addAssignment20_invoker = createInvoker(
    DashboardController_0.addAssignment,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "addAssignment",
      Nil,
      "POST",
      """""",
      this.prefix + """addAssignment"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_DashboardController_deleteAward21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteAward")))
  )
  private[this] lazy val controllers_DashboardController_deleteAward21_invoker = createInvoker(
    DashboardController_0.deleteAward(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "deleteAward",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """deleteAward"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_DashboardController_deleteLanguage22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteLanguage")))
  )
  private[this] lazy val controllers_DashboardController_deleteLanguage22_invoker = createInvoker(
    DashboardController_0.deleteLanguage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "deleteLanguage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """deleteLanguage"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_DashboardController_deleteProgLanguage23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProgLanguage")))
  )
  private[this] lazy val controllers_DashboardController_deleteProgLanguage23_invoker = createInvoker(
    DashboardController_0.deleteProgLanguage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "deleteProgLanguage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """deleteProgLanguage"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_DashboardController_editAward24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editAward")))
  )
  private[this] lazy val controllers_DashboardController_editAward24_invoker = createInvoker(
    DashboardController_0.editAward(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "editAward",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """editAward"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_DashboardController_updateAward25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAward")))
  )
  private[this] lazy val controllers_DashboardController_updateAward25_invoker = createInvoker(
    DashboardController_0.updateAward,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "updateAward",
      Nil,
      "POST",
      """""",
      this.prefix + """updateAward"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_DashboardController_editLanguage26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editLanguage")))
  )
  private[this] lazy val controllers_DashboardController_editLanguage26_invoker = createInvoker(
    DashboardController_0.editLanguage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "editLanguage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """editLanguage"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_DashboardController_updateLanguage27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateLanguage")))
  )
  private[this] lazy val controllers_DashboardController_updateLanguage27_invoker = createInvoker(
    DashboardController_0.updateLanguage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "updateLanguage",
      Nil,
      "POST",
      """""",
      this.prefix + """updateLanguage"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_DashboardController_editProgLanguage28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProgLanguage")))
  )
  private[this] lazy val controllers_DashboardController_editProgLanguage28_invoker = createInvoker(
    DashboardController_0.editProgLanguage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "editProgLanguage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """editProgLanguage"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_DashboardController_updateProgLanguage29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProgLanguage")))
  )
  private[this] lazy val controllers_DashboardController_updateProgLanguage29_invoker = createInvoker(
    DashboardController_0.updateProgLanguage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "updateProgLanguage",
      Nil,
      "POST",
      """""",
      this.prefix + """updateProgLanguage"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_WebJarAssets_at2_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at2_invoker.call(WebJarAssets_2.at(file))
      }
  
    // @LINE:14
    case controllers_DashboardController_getDashboard3_route(params) =>
      call { 
        controllers_DashboardController_getDashboard3_invoker.call(DashboardController_0.getDashboard)
      }
  
    // @LINE:16
    case controllers_DashboardController_addAward4_route(params) =>
      call { 
        controllers_DashboardController_addAward4_invoker.call(DashboardController_0.addAward)
      }
  
    // @LINE:18
    case controllers_DashboardController_addLanguage5_route(params) =>
      call { 
        controllers_DashboardController_addLanguage5_invoker.call(DashboardController_0.addLanguage)
      }
  
    // @LINE:20
    case controllers_DashboardController_addProgLanguage6_route(params) =>
      call { 
        controllers_DashboardController_addProgLanguage6_invoker.call(DashboardController_0.addProgLanguage)
      }
  
    // @LINE:22
    case controllers_DashboardController_getAdminDashboard7_route(params) =>
      call { 
        controllers_DashboardController_getAdminDashboard7_invoker.call(DashboardController_0.getAdminDashboard)
      }
  
    // @LINE:24
    case controllers_LoginController_login8_route(params) =>
      call { 
        controllers_LoginController_login8_invoker.call(LoginController_3.login)
      }
  
    // @LINE:26
    case controllers_LoginController_auth9_route(params) =>
      call { 
        controllers_LoginController_auth9_invoker.call(LoginController_3.auth)
      }
  
    // @LINE:28
    case controllers_DashboardController_logout10_route(params) =>
      call { 
        controllers_DashboardController_logout10_invoker.call(DashboardController_0.logout)
      }
  
    // @LINE:30
    case controllers_DashboardController_getAwards11_route(params) =>
      call { 
        controllers_DashboardController_getAwards11_invoker.call(DashboardController_0.getAwards)
      }
  
    // @LINE:32
    case controllers_DashboardController_getLanguages12_route(params) =>
      call { 
        controllers_DashboardController_getLanguages12_invoker.call(DashboardController_0.getLanguages)
      }
  
    // @LINE:34
    case controllers_DashboardController_getAssignments13_route(params) =>
      call { 
        controllers_DashboardController_getAssignments13_invoker.call(DashboardController_0.getAssignments)
      }
  
    // @LINE:36
    case controllers_DashboardController_getProgLanguages14_route(params) =>
      call { 
        controllers_DashboardController_getProgLanguages14_invoker.call(DashboardController_0.getProgLanguages)
      }
  
    // @LINE:38
    case controllers_DashboardController_getAllAwards15_route(params) =>
      call { 
        controllers_DashboardController_getAllAwards15_invoker.call(DashboardController_0.getAllAwards)
      }
  
    // @LINE:40
    case controllers_DashboardController_getAllLanguages16_route(params) =>
      call { 
        controllers_DashboardController_getAllLanguages16_invoker.call(DashboardController_0.getAllLanguages)
      }
  
    // @LINE:42
    case controllers_DashboardController_getAllProgLanguages17_route(params) =>
      call { 
        controllers_DashboardController_getAllProgLanguages17_invoker.call(DashboardController_0.getAllProgLanguages)
      }
  
    // @LINE:44
    case controllers_DashboardController_getAllAssignments18_route(params) =>
      call { 
        controllers_DashboardController_getAllAssignments18_invoker.call(DashboardController_0.getAllAssignments)
      }
  
    // @LINE:46
    case controllers_DashboardController_getAllInterns19_route(params) =>
      call { 
        controllers_DashboardController_getAllInterns19_invoker.call(DashboardController_0.getAllInterns)
      }
  
    // @LINE:48
    case controllers_DashboardController_addAssignment20_route(params) =>
      call { 
        controllers_DashboardController_addAssignment20_invoker.call(DashboardController_0.addAssignment)
      }
  
    // @LINE:50
    case controllers_DashboardController_deleteAward21_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_DashboardController_deleteAward21_invoker.call(DashboardController_0.deleteAward(id))
      }
  
    // @LINE:52
    case controllers_DashboardController_deleteLanguage22_route(params) =>
      call(params.fromQuery[Int]("sno", None)) { (sno) =>
        controllers_DashboardController_deleteLanguage22_invoker.call(DashboardController_0.deleteLanguage(sno))
      }
  
    // @LINE:54
    case controllers_DashboardController_deleteProgLanguage23_route(params) =>
      call(params.fromQuery[Int]("sno", None)) { (sno) =>
        controllers_DashboardController_deleteProgLanguage23_invoker.call(DashboardController_0.deleteProgLanguage(sno))
      }
  
    // @LINE:56
    case controllers_DashboardController_editAward24_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_DashboardController_editAward24_invoker.call(DashboardController_0.editAward(id))
      }
  
    // @LINE:58
    case controllers_DashboardController_updateAward25_route(params) =>
      call { 
        controllers_DashboardController_updateAward25_invoker.call(DashboardController_0.updateAward)
      }
  
    // @LINE:60
    case controllers_DashboardController_editLanguage26_route(params) =>
      call(params.fromQuery[Int]("sno", None)) { (sno) =>
        controllers_DashboardController_editLanguage26_invoker.call(DashboardController_0.editLanguage(sno))
      }
  
    // @LINE:62
    case controllers_DashboardController_updateLanguage27_route(params) =>
      call { 
        controllers_DashboardController_updateLanguage27_invoker.call(DashboardController_0.updateLanguage)
      }
  
    // @LINE:64
    case controllers_DashboardController_editProgLanguage28_route(params) =>
      call(params.fromQuery[Int]("sno", None)) { (sno) =>
        controllers_DashboardController_editProgLanguage28_invoker.call(DashboardController_0.editProgLanguage(sno))
      }
  
    // @LINE:66
    case controllers_DashboardController_updateProgLanguage29_route(params) =>
      call { 
        controllers_DashboardController_updateProgLanguage29_invoker.call(DashboardController_0.updateProgLanguage)
      }
  }
}