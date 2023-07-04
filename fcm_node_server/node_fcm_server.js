var admin = require('firebase-admin')
var serviceAccount = require('./server_key.json')

admin.initializeApp({
    credential: admin.credential.cert(serviceAccount)
})

var token = "cD2a5aW9TaaTCeQOYpHybV:APA91bH01F2D8Kye9sOXMAU1I3Ce6fMH5seG5syx3cr6Bk1amWHyQTGSNiNQtPrRYsO1NZExgX_rQ_JlMHxHj67K2kG__gGHqmEk0pPMlbEibIkcDESzTXg1cIVp2b3HlyI7IH4qz44N"
var fcm_message = {
    notification: {
        title: 'noti title',
        body: 'noti body..'
    },
    data: {
        title: 'data title',
        value: '20'
    },
    token: token
}

admin.messaging().send(fcm_message)
    .then(function(response) {
        console.log('send ok...')
    })
    .catch(function(error){
        console.log('send error...')
    })