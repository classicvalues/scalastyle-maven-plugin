try {

def file = new File(basedir, 'target')
assert !file.exists()

assert new File(basedir, "build.log").readLines().grep(~/.*\[ERROR\].*Unable to find configuration file at location.*/).size() == 1

return true

} catch(Throwable e) {
  e.printStackTrace()
  return false
}
