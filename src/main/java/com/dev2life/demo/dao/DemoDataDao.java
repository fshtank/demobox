package com.dev2life.demo.dao;




import com.dev2life.demo.model.DemoData;
import com.dev2life.demo.model.DemoWebRequest;

import java.util.List;

public interface DemoDataDao {

//     public List<BlsData> getCampaigns(BlsWebRequest blsWebRequest);
        public List<DemoData> getCampaigns(DemoWebRequest demoWebRequest) ;


}
