package com.travel.application.travelservice.trip.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.trip.dto.FullTripResponse;
import com.travel.application.travelservice.trip.dto.TripRequest;
@Component
public class TripProcess {
	@Autowired
    EntityManager em;
	
	public BaseResponse  setDataQuery(String Query, TripRequest req)
	{
		BaseResponse rep = new BaseResponse();
		Query query = em.createNativeQuery(Query, Tuple.class );
		Long routeID = req.getRouteID();
		Date date = req.getDate();
		query.setParameter("routeID", routeID);
		query.setParameter("date", date);
		List<Tuple> list =  query.getResultList();
		List<FullTripResponse> listRes = new ArrayList();
		for (Tuple tuple : list) {
			FullTripResponse res = new FullTripResponse();
			res.setTripID(((Integer) tuple.get("tripID")).longValue());
			res.setDate(((Date) tuple.get("date")));
			res.setCarID(((Integer) tuple.get("carAmount")).longValue());
			res.setRouteID(((Integer) tuple.get("routeID")).longValue());
			res.setCarCode((String) tuple.get("carCode"));
			res.setCarName((String) tuple.get("carName"));
			res.setLicensePlates((String) tuple.get("licensePlates"));
			res.setCarPrice(((Double) tuple.get("carPrice")).doubleValue());
			res.setCarAmount(((Integer) tuple.get("carAmount")).intValue());
			res.setDepartureTime((String) tuple.get("departureTime"));
			res.setJourneyTime((String) tuple.get("journeyTime"));
			res.setRoutePrice(((Double) tuple.get("routePrice")).doubleValue());
			res.setProvinceStartID(((Integer) tuple.get("provinceStartID")).longValue());
			res.setProvinceEndID(((Integer) tuple.get("provinceEndID")).longValue());
			res.setProvinceStartName((String) tuple.get("provinceStartName"));
			res.setProvinceEndName((String) tuple.get("provinceEndName"));
			listRes.add(res);
		}
		rep.setContent(listRes);
		
		return rep;
		
	}
	
	public String createQueryString( ) {
		   StringBuffer select = new StringBuffer(" SELECT ");
		   StringBuffer from = new StringBuffer(" FROM TRIP AS T ");
		   StringBuffer where = new StringBuffer(" WHERE ");
		   	  select.append(" t.trip_id as tripID, t.date , t.car_id as carID , t.route_id as routeID, ")
					.append(" c.code as carCode,c.name as carName,c.license_plates as licensePlates, c.price as carPrice, c.amount as carAmount, ")
					.append(" r.departure_time as departureTime, r.journey_time as journeyTime, r.price as routePrice, r.province_start as provinceStartID, r.province_end as provinceEndID , provinceStartName.name as provinceStartName, provinceEndName.name as provinceEndName");
		   	    from.append(" left join car  as c on  t.car_id = c.car_id ")
		   	    	.append(" left join route as r on t.route_id = r.route_id ")
		   	    	.append(" left join (select prs.province_id  as id , prs.name from province as prs)as provinceStartName on  provinceStartName.id = r.province_start ")
		   	    	.append(" left join (select pre.province_id as id, pre.name from province as pre)as provinceEndName on  provinceEndName.id = r.province_end ");
		   	    where.append("t.route_id = :routeID and date = :date");
		   StringBuffer queryString = new StringBuffer();
				queryString.append(select).append(from).append(where);
	return queryString.toString();
				   
	   }
}
