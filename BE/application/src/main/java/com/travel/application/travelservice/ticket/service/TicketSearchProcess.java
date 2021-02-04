package com.travel.application.travelservice.ticket.service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.ticket.dto.HistoryTicketResponse;
import com.travel.application.travelservice.ticket.dto.TicketRequest;
@Component
public class TicketSearchProcess {
	@Autowired
	public EntityManager em;

	public BaseResponse setDataQuery(String Query, TicketRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Query query = em.createNativeQuery(Query, Tuple.class);
		String ticketCode = req.getTicketCode();
		Date date = req.getDateGo();
		Long provinceStart = req.getProvinceStart();
		Long provinceEnd = req.getProvinceEnd();
		Long status = req.getStatusID();
		Long userID = req.getUserID();
		if (req.getTicketCode() != null ) {
			query.setParameter("ticketCode", ticketCode);
		}
		if (req.getDateGo() != null ) {
			query.setParameter("date", date);
		}
		if (req.getProvinceStart() != null) {
			query.setParameter("provinceStart", provinceStart);
		}
		if (req.getProvinceEnd() != null) {
			query.setParameter("provinceEnd", provinceEnd);
		}
		if (req.getStatusID() != null) {
			query.setParameter("status", status);
		}
		if (req.getUserID() != null) {
			query.setParameter("userID", userID);
		}
		List<Tuple> list = query.getResultList();
		List<HistoryTicketResponse> listRes = new  ArrayList();
			for (Tuple tuple : list) {
				HistoryTicketResponse res = new HistoryTicketResponse();
				res.setTicketID(((BigInteger) tuple.get("ticketID")).longValue());
				res.setDateBuyTicket(((Date) tuple.get("dateBuyTicket")));
				res.setDateGo(((Date) tuple.get("dateGo")));
				res.setTicketCode(((String) tuple.get("ticketCode")));
				res.setLicensePlates(((String) tuple.get("licensePlates")));
				res.setSeat(((String)tuple.get("seats")));
				res.setAmountSeats(((Integer)tuple.get("amountSeats")).intValue());
				res.setProvinceStartName(((String)tuple.get("provinceStart")));
				res.setProvinceEndName(((String)tuple.get("provinceEnd")));
				res.setPrice(((Double) tuple.get("price")).doubleValue());
				res.setStatus(((String)tuple.get("status")));
				if(((BigInteger) tuple.get("userID"))!=null)
				{
					res.setUserID(((BigInteger) tuple.get("userID")).longValue());
				}
				else
				{
					res.setUserID((long) 0);
				}
				
				listRes.add(res);
			}
			cmRep.setContent(listRes);
		return cmRep;
	}

	public String createQueryString(TicketRequest req) {
		StringBuffer select = new StringBuffer(" SELECT ");
		StringBuffer from = new StringBuffer(" FROM TICKET AS T ");
		StringBuffer where = new StringBuffer(" WHERE 1 AND ");
		select.append(
				" T.ticket_id AS ticketID, T.date AS dateBuyTicket,TR.date AS dateGo , T.ticket_code AS ticketCode, C.license_plates AS licensePlates, T.seats AS seats, T.amount_seats AS amountSeats, provinceStart.name AS  provinceStart,  provinceEnd.name AS provinceEnd, T.price AS price, T.user_id AS userID,  ST.name AS status ");
		from.append(" LEFT JOIN status_ticket AS ST ON T.status = ST.status_id ");
		from.append(" LEFT JOIN trip  AS TR ON TR.trip_id = T.trip_id");
		from.append(" LEFT JOIN route AS R ON TR.route_id = R.route_id");
		from.append(
				" LEFT JOIN (SELECT province_id,  name FROM province ) AS provinceStart ON R.province_start = provinceStart.province_id");
		from.append(
				" LEFT JOIN (SELECT province_id, name FROM province) AS provinceEnd ON R.province_end = provinceEnd.province_id");
		from.append(" LEFT JOIN car  AS C ON c.car_id = TR.car_id");
		if (req.getTicketCode() != null) {
			where.append("  T.ticket_code = :ticketCode AND ");
		}
		if (req.getDateBuyTicket() != null ) {
			where.append("  TR.date = :date AND ");
		}
		if (req.getDateGo() != null ) {
			where.append("  T.date = :date AND ");
		}
		if (req.getProvinceStart() != null ) {
			where.append("  R.province_start = :provinceStart AND ");
		}
		if (req.getProvinceEnd() != null ) {
			where.append("  R.province_end = :provinceEnd AND ");
		}
		if (req.getStatusID() != null) {
			where.append("  T.status = :status AND ");
		}
		if (req.getUserID() != null) {
			where.append("  T.user_id = :userID AND ");
		}
		where.append(" 1 ");
		StringBuffer queryString = new StringBuffer();
		queryString.append(select).append(from).append(where);
		return queryString.toString();
	}
}
