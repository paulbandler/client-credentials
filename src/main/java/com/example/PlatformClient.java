package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.Optional;

@Client("${downstream.platform.url}/platformapi/api")
public interface PlatformClient {

  @Get("/users/{ppid}")
  Optional<String> userWith(String ppid);

}
