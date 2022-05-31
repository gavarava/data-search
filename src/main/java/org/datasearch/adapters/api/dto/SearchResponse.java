package org.datasearch.adapters.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class SearchResponse {
    @JsonProperty
    List<String> searchResult;

    @JsonProperty
    long searchTimeInMilliseconds;
}
