package org.scoula.travel.service;

public interface TravelService {

    // 전체 관광지 목록 출력하기
    //no, district, title만 출력
    void printTravels();

    // 특정 권역의 관광지 목록 출력하기 (권역목록 출력, 출력할 권역을 입력받음)
    //no, district, title만 출력
    void printTravelsByDistrict();

    // 특정 페이지의 관광지 목록 출력하기 (전체 페이지 출력)
    //no, district, title만 출력
    void printTravelsByPage();

    // 관광지 상세 보기 (출력할 관광지 번호를 입력받음, 이미지 정보를 포함한 모든 정보 출력하기)
    void printTravel();
}
