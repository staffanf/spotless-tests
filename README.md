Step to reproduce
=================

**Issue 167, https://github.com/diffplug/spotless/issues/167**

* `./gradlew spotlessApply`
  * This will not modify files
* Start Eclipse Neon3 and open file "App.Java"
* Modify whitespace and save (Ctrl-S).
  * This changes the import order. Eclipse sorts upper case first in same group.