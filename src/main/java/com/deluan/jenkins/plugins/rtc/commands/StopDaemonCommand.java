package com.deluan.jenkins.plugins.rtc.commands;

import hudson.util.ArgumentListBuilder;

/**
 * @author deluan
 */
public class StopDaemonCommand extends AbstractCommand {

    public StopDaemonCommand(JazzConfigurationProvider configurationProvider) {
        super(configurationProvider);
    }

    public ArgumentListBuilder getArguments() {
        ArgumentListBuilder args = new ArgumentListBuilder();
        args.add("daemon");
        args.add("stop");
        args.add(getConfig().getJobWorkspace());

        return args;
    }

}
