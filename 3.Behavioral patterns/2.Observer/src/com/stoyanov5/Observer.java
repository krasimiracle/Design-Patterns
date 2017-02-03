package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 03-Feb-17.
 */
public interface Observer {

    public void update();

    public void setSubject(Subject subject);

}
