package com.linsama.jit.runtime;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JitRuntime {

    private final Path rootPath;

    public JitRuntime() {
        rootPath = Paths.get(getJitRootPath());
    }

    private String getJitRootPath() {
        return "";
    }

    public void validateJitRepo() {
        String pwd = System.getProperty("user.dir");
        File file = new File(pwd + "/.jit");
        if (!file.exists()) {
            System.out.println("Current directory is not a jit repo, please init first");
            System.exit(1);
        }
    }
}
