package be.vdab.restclients;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility=Visibility.ANY)
class Rates {
	@JsonProperty("USD")
	BigDecimal usd;
}