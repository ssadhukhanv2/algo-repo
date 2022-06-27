package com.ssadhukhanv2.algo.algorepo.backbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author Subhrajit Sadhukhan
 */
public class StringPathChanger {
    public static void main(String[] args) {
        System.out.println(changeDirectoryString("/dev/task", "cd /"));
        System.out.println(changeDirectoryString("/dev/task", "cd .."));
        System.out.println(changeDirectoryString("/dev/task", "cd java"));
        System.out.println(changeDirectoryString("/dev/task", "cd java/"));
        System.out.println(changeDirectoryString("/dev/task", "cd ../solution"));
        System.out.println(changeDirectoryString("/dev/task/java", "cd ../.."));
        System.out.println(changeDirectoryString("/dev/task/java", "wrong ../.."));
    }

    public static String changeDirectoryString(String currentDirectory, String command) {
        if (null == command || !command.startsWith("cd")) {
            throw new IllegalStateException();
        }
        String target = command.substring(3);
        if (currentDirectory.endsWith("/")) {
            currentDirectory = currentDirectory.substring(0, target.length() - 1);
        }
        if (target.length()>1 && target.endsWith("/")) {
            target = target.substring(0, target.length() - 1);
        }
        if (target.startsWith("/")) {
            return target;
        }

        Stack<String> targetStack = new Stack<>();
        String[] tempPath = (currentDirectory + "/" + target).split("/");
        for (int i = 0; i < tempPath.length; i++) {
            String currentElement = tempPath[i];
            if (currentElement.equals("..")) {
                if (targetStack.empty()) {
                    throw new IllegalArgumentException();
                } else {
                    targetStack.pop();
                }
            } else if (currentElement.equals(".") || currentElement.equals("")) {
                continue;
            } else {
                targetStack.push(currentElement);
            }
        }
        if (targetStack.empty()) {
            throw new IllegalStateException();
        }

        Iterator iterator = targetStack.iterator();
        String finalTarget = "/";
        while (iterator.hasNext()) {
            finalTarget += (iterator.next() + "/");
        }
        if (finalTarget.endsWith("/")) {
            finalTarget = finalTarget.substring(0, finalTarget.length() - 1);
        }
        return finalTarget;
    }
}
