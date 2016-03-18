
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/gitrepository/AjaxWithPlay/bootstrapform/conf/routes
// @DATE:Thu Mar 17 18:09:03 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
