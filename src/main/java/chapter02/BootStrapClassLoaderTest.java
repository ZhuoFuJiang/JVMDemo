package chapter02;

import java.net.URL;

public class BootStrapClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("---启动类加载器---");
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for(URL element: urls) {
            System.out.println(element.toExternalForm());
        }

        System.out.println("---启动扩展类加载器---");
        String extDirs = System.getProperty("java.ext.dirs");
        for(String path: extDirs.split(";")) {
            System.out.println(path);
        }
    }
}
