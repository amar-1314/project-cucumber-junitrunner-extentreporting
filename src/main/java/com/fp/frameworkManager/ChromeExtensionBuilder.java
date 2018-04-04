package com.fp.frameworkManager;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class ChromeExtensionBuilder {

    private Set<String> built = new HashSet<String>();

    public void BuildAuthExtension(String path) throws IOException {
        String username = "akommineni";
        String password = "FrontPointRocks!";
        if (isAlreadyBuilt(path, username, password)) {
            return;
        }
        FileUtils.copyFile(new File("extensions/auth/manifest.json"), new File(path + "/manifest.json"));

        String content = new String(Files.readAllBytes(Paths.get("extensions/auth/background.js")));
        content = content.replace("{username}", username);
        content = content.replace("{password}", password);
        FileUtils.writeStringToFile(new File(path + "/background.js"), content, String.valueOf(StandardCharsets.UTF_8));
    }

    private boolean isAlreadyBuilt(String pathStr, String username, String password) throws IOException {
        if (built.contains(pathStr)) {
            return true;
        }
        Path path = Paths.get(pathStr + "/background.js");
        if (!Files.exists(path)) {
            return false;
        }
        String content = new String(Files.readAllBytes(path));
        if (content.contains(username) && content.contains(password)) {
            built.add(pathStr);
            return true;
        }
        return false;
    }
}
