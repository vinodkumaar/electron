package obc

import groovyx.net.http.RESTClient
import spock.lang.Specification

class SampleSpec extends Specification {
    def "The server should be up and listening for requests"() {
        given: "A URI to test"
          def env = System.getenv()
          def client = new RESTClient(env['URI_TO_TEST'])
        when: "accessing any page for the uri"
          def response = client.get(path: "/")
        then: "response should always be OK"
          response.status == 200
    }
}
