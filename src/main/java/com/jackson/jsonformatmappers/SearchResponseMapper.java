package com.jackson.jsonformatmappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trvl.integration.domain.internalobjects.search.response.*;
import com.trvl.integration.domain.universalair.search.response.Response;
import com.trvl.integration.domain.universalair.search.response.Result;
import com.trvl.integration.domain.universalair.search.response.SearchResponse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchResponseMapper {
    public static void main(String[] args) throws Exception
    {
        SearchResponseMapper searchRequestMapper=new SearchResponseMapper();
        System.out.println("OUTPUT JSON :\n"+searchRequestMapper.mapAPISearchResponseToUISearchResponse());
    }





    String mapAPISearchResponseToUISearchResponse() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SearchResponse searchResponse=mapper.readValue(new File("inputsamples/SearchAPIResponse.json"), SearchResponse.class);
        System.out.println("Converted json to object successfully.");
        UISearchResponse uiSearchResponse=new UISearchResponse();
        uiSearchResponse=mapAPISearchResponseToUISearchResponseImpl(searchResponse);
        return mapper.writeValueAsString(uiSearchResponse);
    }






    UISearchResponse mapAPISearchResponseToUISearchResponseImpl(SearchResponse searchResponse)
    {
        String requestId="dummy";
        String sessionId="dummy";
        String appId="skandha";
        String requesterType="searchresponse";
        String pseudoCityCode="dummy";
        String companyName="cosmos";

///////////////////////////////////////////////////////////////////////////////////////
        UISearchResponse uiSearchResponse=new UISearchResponse(); // Incoming Object
//////////////////////////////////////////////////////////////////////////////////////

        //List<FlightSegment> flightSegments=new ArrayList<>();
        //FlightSegment flightSegment=new FlightSegment();
        // ;

        Response response=searchResponse.getResponse();
        List<List<Result>> results=response.getResults();
        List<Result> listOfResults=results.get(0);
        System.out.println("Total Search Results = "+listOfResults.size());

        PricedItineraries pricedItineraries=new PricedItineraries();
        List<PricedItinerary> listOfPricedItinerary= new ArrayList();

        for(int i=0;i<listOfResults.size();i++)
        {
            PricedItinerary pricedItinerary=new PricedItinerary();
            pricedItinerary.setSequenceNumber((i+1)+"");

            TPAExtensions tpaExtensions=new TPAExtensions();
            tpaExtensions.setETicket("true");
            tpaExtensions.setValidatingCarrierCode(listOfResults.get(i).getSegments().get(0).get(0).getAirline().getFlightNumber());

            pricedItinerary.setTPAExtensions(tpaExtensions);

            AirItinerary airItinerary=new AirItinerary();
            airItinerary.setDirectionInd("N.A");
            OriginDestinationOption originDestinationOption=new OriginDestinationOption();

            //FLIGHT SEGMENT MAPPING
            FlightSegment flightSegment=new FlightSegment();

            flightSegment.setDepartureDateTime(listOfResults.get(i).getSegments().get(0).get(0).getOrigin().getDepTime());
            flightSegment.setArrivalDateTime(listOfResults.get(i).getSegments().get(0).get(0).getDestination().getArrTime());
            flightSegment.setStopQuantity(listOfResults.get(i).getSegments().get(0).get(0).getStopPoint());
            flightSegment.setFlightNumber(listOfResults.get(i).getSegments().get(0).get(0).getAirline().getFlightNumber());
            flightSegment.setResBookDesigCode("N.A");
            flightSegment.setElapsedTime(listOfResults.get(i).getSegments().get(0).get(0).getDuration().toString());
            flightSegment.setDepartureAirportLocationCode(listOfResults.get(i).getSegments().get(0).get(0).getOrigin().getAirport().getAirportCode());
            flightSegment.setArrivalAirportLocationCode(listOfResults.get(i).getSegments().get(0).get(0).getDestination().getAirport().getAirportCode());
            flightSegment.setDepartureAirportTerminalID(listOfResults.get(i).getSegments().get(0).get(0).getOrigin().getAirport().getTerminal());
            flightSegment.setArrivalAirportTerminalID(listOfResults.get(i).getSegments().get(0).get(0).getDestination().getAirport().getTerminal());
            flightSegment.setAirEquipType(listOfResults.get(i).getSegments().get(0).get(0).getCraft());
            flightSegment.setMarketingAirlineCode(listOfResults.get(i).getSegments().get(0).get(0).getAirline().getAirlineCode());
            flightSegment.setDepartureTimeZone("N.A");
            flightSegment.setArrivalTimeZone("N.A");
            flightSegment.setETicketInd(listOfResults.get(i).getSegments().get(0).get(0).getIsETicketEligible().toString());

            originDestinationOption.setFlightSegment(flightSegment);
            originDestinationOption.setElapsedTime("N.A");
            airItinerary.setOriginDestinationOption(originDestinationOption);

            pricedItinerary.setAirItinerary(airItinerary);

            //AIR ITINERARY PRICING
            AirItineraryPricingInfo airItineraryPricingInfo = new AirItineraryPricingInfo();
            airItineraryPricingInfo.setPricingSource(listOfResults.get(i).getSource().toString());
            airItineraryPricingInfo.setPricingSubSource("N.A");
            airItineraryPricingInfo.setFareReturned("N.A boolean");
            airItineraryPricingInfo.setPrivateFareType("N.A");
            airItineraryPricingInfo.setDivideInPartyInd("N.A Boolean");

            pricedItinerary.setAirItineraryPricingInfo(airItineraryPricingInfo);

            //ITINTOTALFARE MAPPING
            ItinTotalFare itinTotalFare=new ItinTotalFare();
            itinTotalFare.setBaseFareAmount(listOfResults.get(i).getFare().getBaseFare().toString());
            itinTotalFare.setBaseFareCurrencyCode(listOfResults.get(i).getFare().getCurrency());
            itinTotalFare.setBaseFareDecimalPlaces("N.A");
            itinTotalFare.setFareConstructionAmount("N.A");
            itinTotalFare.setFareConstructionCurrencyCode("N.A");
            itinTotalFare.setFareConstructionDecimalPlaces("N.A");
            itinTotalFare.setEquivFareAmount(listOfResults.get(i).getFare().getPublishedFare().toString());
            itinTotalFare.setEquivFareCurrencyCode(listOfResults.get(i).getFare().getCurrency());
            itinTotalFare.setEquivFareDecimalPlaces("N.A");
            itinTotalFare.setTaxCode("N.A");
            itinTotalFare.setTaxAmount(listOfResults.get(i).getFare().getTax().toString());
            itinTotalFare.setTaxCurrencyCode(listOfResults.get(i).getFare().getCurrency());
            itinTotalFare.setTaxDecimalPlaces("N.A");
            itinTotalFare.setTotalFareAmount(listOfResults.get(i).getFare().getOfferedFare().toString());
            itinTotalFare.setTotalFareCurrencyCode(listOfResults.get(i).getFare().getCurrency().toString());
            itinTotalFare.setTotalFareDecimalPlaces("N.A");

            airItineraryPricingInfo.setItinTotalFare(itinTotalFare);

            PTCFareBreakdowns ptcFareBreakdowns=new PTCFareBreakdowns();

            List<PtcFareBreakdown> listOfPtcFareBreakdown=new ArrayList();

            for (int j=0;j<listOfResults.get(i).getFareBreakdown().size();j++)
            {
                PtcFareBreakdown ptcFareBreakdown=new PtcFareBreakdown();
                ptcFareBreakdown.setPrivateFareType("N.A");
                int passengerType=listOfResults.get(i).getFareBreakdown().get(j).getPassengerType();

                if(passengerType==1)
                    ptcFareBreakdown.setPassengerTypeQuantityCode("ADT");
                else if(passengerType==2)
                    ptcFareBreakdown.setPassengerTypeQuantityCode("CNN");
                else if(passengerType==3)
                    ptcFareBreakdown.setPassengerTypeQuantityCode("INF");
                else
                    ptcFareBreakdown.setPassengerTypeQuantityCode("UNKNOWN");

                ptcFareBreakdown.setPassengerTypeQuantity(listOfResults.get(i).getFareBreakdown().get(j).getPassengerCount().toString());
                ptcFareBreakdown.setNonRefundableIndicator(""+(listOfResults.get(i).getIsRefundable()));

                FareBasisCodes fareBasisCodes=new FareBasisCodes();
                FareBasisCode fareBasisCode=new FareBasisCode();

                //FARE BASIS CODE MAPPING
                fareBasisCode.setPrivateFareType("N.A");
                fareBasisCode.setDepartureAirportCode(listOfResults.get(i).getSegments().get(0).get(0).getOrigin().getAirport().getAirportCode());
                fareBasisCode.setArrivalAirportCode(listOfResults.get(i).getSegments().get(0).get(0).getDestination().getAirport().getAirportCode());
                fareBasisCode.setFareComponentBeginAirport(listOfResults.get(i).getSegments().get(0).get(0).getOrigin().getAirport().getAirportCode());
                fareBasisCode.setAvailabilityBreak("N.A");
                fareBasisCode.setFareComponentEndAirport(listOfResults.get(i).getSegments().get(0).get(0).getDestination().getAirport().getAirportCode());
                fareBasisCode.setFareComponentDirectionality("N.A");
                fareBasisCode.setFareBasisCode("N.A");

                fareBasisCodes.setFareBasisCode(fareBasisCode);
                ptcFareBreakdown.setFareBasisCodes(fareBasisCodes);

                //PASSENGER FARE MAPPING
                PassengerFare passengerFare=new PassengerFare();
                passengerFare.setBaseFareAmount(listOfResults.get(i).getFareBreakdown().get(j).getBaseFare().toString());
                passengerFare.setBaseFareCurrencyCode(listOfResults.get(i).getFareBreakdown().get(j).getCurrency().toString());
                passengerFare.setFareConstructionAmount((listOfResults.get(i).getFareBreakdown().get(j).getBaseFare()+listOfResults.get(i).getFareBreakdown().get(j).getTax())+"");
                passengerFare.setFareConstructionCurrencyCode(listOfResults.get(i).getFareBreakdown().get(j).getCurrency().toString());
                passengerFare.setCurrencyCodeDecimalPlaces("N.A");
                passengerFare.setEquivFareAmount("N.A");
                passengerFare.setEquivFareCurrencyCode(listOfResults.get(i).getFareBreakdown().get(j).getBaseFare().toString());
                passengerFare.setEquivFareDecimalPlaces("N.A");
                passengerFare.setTotalFareAmount((listOfResults.get(i).getFareBreakdown().get(j).getBaseFare()+listOfResults.get(i).getFareBreakdown().get(j).getTax()+listOfResults.get(i).getFareBreakdown().get(j).getYQTax())+"");
                passengerFare.setTotalFareCurrencyAmount(listOfResults.get(i).getFareBreakdown().get(j).getCurrency().toString());

                Taxes taxes=new Taxes();

                //TAX MAPPING
                Tax tax=new Tax();
                tax.setAmount(listOfResults.get(i).getFareBreakdown().get(j).getTax().toString());
                tax.setTaxCode("N.A");
                tax.setCurrencyCode(listOfResults.get(i).getFare().getCurrency().toString());
                tax.setDecimalPlaces("N.A");
                taxes.setTax(tax);

                passengerFare.setTaxes(taxes);

                //SURCHARGE MAPPING
                Surcharges surcharges=new Surcharges();
                surcharges.setSurcharges("N.A");
                surcharges.setSurchargesInd("N.A");
                surcharges.setSurchargesType("N.A");

                passengerFare.setSurcharges(surcharges);

                //MESSAGE MAPPING
                Messages messages=new Messages();
                Message message=new Message();
                message.setAirlineCode(listOfResults.get(i).getSegments().get(0).get(0).getAirline().getAirlineCode());
                message.setFailCode("N.A");
                message.setInfo(listOfResults.get(i).getTicketAdvisory());
                message.setMessage("N.A");
                message.setMessageType("N.A");

                messages.setMessage(message);

                passengerFare.setMessages(messages);

                //BAGGAGE INFORMATION LIST MAPPING
                BaggageInformationList baggageInformationList=new BaggageInformationList();
                BaggageInformation baggageInformation=new BaggageInformation();
                baggageInformation.setAllowance(listOfResults.get(i).getBaggageAllowance());
                baggageInformation.setSegmentId("N.A");

                baggageInformationList.setBaggageInformation(baggageInformation);
                passengerFare.setBaggageInformationList(baggageInformationList);

                //FAREINFOS MAPPING
                FareInfos fareInfos=new FareInfos();
                FareInfo fareInfo=new FareInfo();
                fareInfo.setBelowMin("N.A");
                fareInfo.setFareReference(listOfResults.get(i).getFareRules().get(0).getFareBasisCode());
                fareInfo.setMealcode("N.A");
                fareInfo.setSeatsRemaining(listOfResults.get(i).getSegments().get(0).get(0).getNoOfSeatAvailable().toString());

                fareInfos.setFareInfo(fareInfo);

                ptcFareBreakdown.setFareInfos(fareInfos);
                ptcFareBreakdown.setPassengerFare(passengerFare);
                ptcFareBreakdown.setFareBasisCodes(fareBasisCodes);

                listOfPtcFareBreakdown.add(ptcFareBreakdown);

            }

            ptcFareBreakdowns.setPtcFareBreakdown(listOfPtcFareBreakdown);
            airItineraryPricingInfo.setPTCFareBreakdowns(ptcFareBreakdowns);

            //TICKETING INFO MAPPING
            TicketingInfo ticketingInfo=new TicketingInfo();
            ticketingInfo.setTicketType("N.A");
            ticketingInfo.setValidInterline("N.A");

            pricedItinerary.setTicketingInfo(ticketingInfo);

            listOfPricedItinerary.add(pricedItinerary);

        }

        pricedItineraries.setPricedItinerary(listOfPricedItinerary);

        AirLowFareSearchRS airLowFareSearchRS=new AirLowFareSearchRS();
        airLowFareSearchRS.setPricedItineraries(pricedItineraries);


        //REQUESTER DETAILS MAPPING
        RequesterDetails requesterDetails=new RequesterDetails();
        requesterDetails.setAppID(appId);
        requesterDetails.setCompanyName(companyName);
        requesterDetails.setPseudoCityCode(pseudoCityCode);
        requesterDetails.setRequesterType(requesterType);
        requesterDetails.setSessionID(sessionId);
        requesterDetails.setRequestId(searchResponse.getResponse().getTraceId());
        requesterDetails.setUserName("N.A");

        airLowFareSearchRS.setRequesterDetails(requesterDetails);

        uiSearchResponse.setAirLowFareSearchRS(airLowFareSearchRS);

    return  uiSearchResponse;


}}
