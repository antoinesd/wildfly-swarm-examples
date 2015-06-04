package org.wildfly.swarm.examples.jaxrs.shrinkwrap;

import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSDeployment;

/**
 * @author Bob McWhirter
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Container container = new Container();

        JAXRSDeployment deployment = new JAXRSDeployment( container );
        deployment.addResource(MyResource.class);

        container.start().deploy( deployment );

    }
}
