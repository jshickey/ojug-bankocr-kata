class Util {
    File stringToClassPathFile(String fileName) {
		new File(getClass().getClassLoader().getResource(fileName).getFile());
    }
}