 import React from "react";
   
 import { useParams } from "react-router-dom";
 import {ZegoUIKitPrebuilt} from '@zegocloud/zego-uikit-prebuilt'


 const RoomPage = () => {
    const {roomId}= useParams ();
     
    const myMeeting = async (element) => {
       const appId = 1905972175;
       const serverSecret="680908017a0c2eb894aa2e0b2519df64";
       const kitToken = ZegoUIKitPrebuilt.generateKitTokenForTest(appId, serverSecret,
         roomId, 
         Date.now().toString(), 
         "Dev Ghule"
         );
       const zc = ZegoUIKitPrebuilt.create(kitToken);  
    zc.joinRoom({
        container:element,
        sharedLinks:[
            {
                name:"Copy Link",
                url:`http://localhost:3001/room/${roomId}`,
            },
        ],
        scenario:{
          // mode:ZegoUIKitPrebuilt.OneONoneCall,
           mode:ZegoUIKitPrebuilt.OneONoneCall,
        },
        showScreenSharingButton: true,
        turnOnMicrophoneWhenJoining:true,
        showAudioVideoSettingsButton:true,
        showUserJoinAndLeave:true, 
        
    }); 
        
    };



    return <div>
           
           <div ref ={myMeeting}/>

    </div>;
 };

 export default RoomPage; 