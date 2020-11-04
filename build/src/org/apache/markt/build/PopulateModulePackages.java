package org.apache.markt.build;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

import jdk.internal.module.ModuleInfoExtender;

public class PopulateModulePackages {

    public static void main(String[] args) throws Exception {
        // CWD is root of build project
        File originalInfo = new File("../impl/bin/module-info.class");
        File updatedInfo = new File("../impl/bin/module-info.class.new");

        InputStream is = new FileInputStream(originalInfo);

        Set<String> packages = new HashSet<>();
        // Exported
        packages.add("org.apache.markt.impl");

        // Internal
        packages.add("org.apache.markt.internal");
        packages.add("org.apache.markt.util");

        ModuleInfoExtender extender = ModuleInfoExtender.newExtender(is);
        extender.packages(packages);

        OutputStream os = new FileOutputStream(updatedInfo);
        extender.write(os);

        is.close();
        os.close();

        originalInfo.delete();
        updatedInfo.renameTo(originalInfo);
    }
}
