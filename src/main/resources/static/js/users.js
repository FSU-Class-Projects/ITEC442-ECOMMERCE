
$(function(){
    $('#tblUsers').DataTable();

    $('#tblMerchandises').DataTable({
        "ajax": {
            "url": '/data/merchandises',
            "dataSrc": '',
            "method": 'POST'
        },
        "columns" : [
            {
                "data": 'upc'
            },
            {
                "data": 'title'
            },
            {
                "data": 'description'
            },
            {
                "data": 'price'
            }
            ]
    });
});