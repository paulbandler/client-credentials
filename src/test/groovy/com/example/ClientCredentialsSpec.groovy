package com.example

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import io.reactivex.Flowable
import spock.lang.Specification
import javax.inject.Inject

@MicronautTest
class ClientCredentialsSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application
    @Inject
    PlatformClient platformClient

    void 'test it works'() {
        given:
        Optional<String> user = platformClient.userWith("1007979703")
        expect:
        if(user.ifPresent())
            System.out.println(user.toString())
        application.running
    }

}
