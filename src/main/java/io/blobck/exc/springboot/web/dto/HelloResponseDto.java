package io.blobck.exc.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class HelloResponseDto {

    private final String name;
    private final int amount;
}